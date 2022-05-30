package com.zy.zymovies.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zy.zymovies.entity.Movie;
import com.zy.zymovies.entity.TWant;
import com.zy.zymovies.entity.TWatched;

import com.zy.zymovies.service.*;

import com.zy.zymovies.entity.TComment;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController extends BaseController{
    @Autowired
    private IMovieService iMovieService;

    @Autowired
    private TWantService tWantService;

    @Autowired
    private TWatchedService tWatchedService;

    @Autowired
    private TCommentService tCommentService;

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/movielist")
    @ResponseBody
    public JSONArray movielist(){
        JSONArray jsonArray=new JSONArray();
        List<Movie> list=iMovieService.getAllMovie();
        jsonArray.addAll(list);
        return jsonArray;

    }

   /* @RequestMapping("/hello")
    public String hello(Model model){
        List<Movie> list=iMovieService.getAllMovie();
        model.addAttribute("movielist",list);
        return "hello";
    }*/


    @RequestMapping("/addIWant")
    @ResponseBody
    public JSONObject addIWant(Integer mid, HttpSession session){
        JSONObject jsonObject=new JSONObject();
        Integer uid=getUidFromSession(session);
        TWant tWant=new TWant();
        tWant.setUid(uid);
        tWant.setMid(mid);
        tWant.setDate(new Date(System.currentTimeMillis()));
        if(mid==null){
            jsonObject.put("state",4000);
        }else {
            tWantService.AddIWantWatch(tWant);
            jsonObject.put("state", 200);
        }
        return jsonObject;

    }

    @RequestMapping("/deleteIWant")
    @ResponseBody
    public JSONObject deleteIWant(Integer mid, HttpSession session){
        JSONObject jsonObject=new JSONObject();
        Integer uid=getUidFromSession(session);
        if(mid==null){
            jsonObject.put("state",4000);
        }else {
            tWantService.deleteByMidAndUid(mid, uid);
            jsonObject.put("state", 200);
        }
        return jsonObject;

    }

    @RequestMapping("/allIWant")
    @ResponseBody
    public JSONArray allIWantMovieList(HttpSession session){
        JSONArray jsonArray=new JSONArray();
        List<TWant> list=tWantService.searchAllByUid(getUidFromSession(session));
        for(TWant item:list){
            item.setMname(iMovieService.getMovieByMid(item.getMid()).getMname());
        }
        jsonArray.addAll(list);
        return jsonArray;
    }

    @RequestMapping("/addIWatched")
    @ResponseBody
    public JSONObject addIWatched(Integer mid, Integer myrate,HttpSession session){
        JSONObject jsonObject=new JSONObject();
        Integer uid=getUidFromSession(session);
        TWatched tWatched=new TWatched();
        tWatched.setUid(uid);
        tWatched.setMid(mid);
        tWatched.setMyrate(myrate);
        tWatched.setDate(new Date(System.currentTimeMillis()));


        if(mid==null){
            jsonObject.put("state",4000);
        }else {
            tWatchedService.addIWatched(tWatched);
            jsonObject.put("state", 200);
        }
        return jsonObject;

    }

    @RequestMapping("/deleteIWatched")
    @ResponseBody
    public JSONObject deleteIWatched(Integer mid, HttpSession session){
        JSONObject jsonObject=new JSONObject();
        Integer uid=getUidFromSession(session);
        if(mid==null){
            jsonObject.put("state",4000);
        }else {
            tWatchedService.deleteByMidAndUid(mid, uid);
            jsonObject.put("state", 200);
        }
        return jsonObject;

    }

    @RequestMapping("/allIWatched")
    @ResponseBody
    public JSONArray allIWatchedMovieList(HttpSession session){
        JSONArray jsonArray=new JSONArray();
        List<TWatched> list=tWatchedService.searchAllByUid(getUidFromSession(session));
        for(TWatched item:list){
            item.setMname(iMovieService.getMovieByMid(item.getMid()).getMname());
        }
        jsonArray.addAll(list);
        return jsonArray;
    }

    @RequestMapping("/addMyComment")
    @ResponseBody
    public JSONObject addMyComment(Integer mid,String mycomment,HttpSession session){
        JSONObject jsonObject=new JSONObject();
        Integer uid=getUidFromSession(session);
        TComment tComment=new TComment();
        tComment.setUid(uid);
        tComment.setMid(mid);
        tComment.setDate(new Date(System.currentTimeMillis()));
        tComment.setContent(mycomment);
        if(mid==null){
            jsonObject.put("state",4000);
        }else {
            tCommentService.addMyComment(tComment);
            jsonObject.put("state", 200);
        }
        return jsonObject;

    }

    @RequestMapping("/allComment")
    @ResponseBody
    public JSONArray allComment(){
        JSONArray jsonArray=new JSONArray();
        List<TComment> list=tCommentService.searchAll();
        for(TComment item:list){
            item.setMname(iMovieService.getMovieByMid(item.getMid()).getMname());
            item.setUname(iUserService.selectUsernameByUid(item.getUid()));
        }
        jsonArray.addAll(list);
        return jsonArray;
    }

    @RequestMapping("/deleteMyComment")
    @ResponseBody
    public JSONObject deleteMyComment(Integer mid,HttpSession session){
        JSONObject jsonObject=new JSONObject();
        Integer uid=getUidFromSession(session);
        if(mid==null){
            jsonObject.put("state",4000);
        }else {
            tCommentService.deleteMyComment(mid,uid);
            jsonObject.put("state", 200);
        }
        return jsonObject;
    }


}
