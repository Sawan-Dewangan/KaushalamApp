package com.skd.KaushalamApp;
//class for item in recyclerView.
public class Rview_list {
    private String mtext1;
    private String mtext2;
    private String mtext3;

    public Rview_list(String text1, String text2, String text3){

        mtext1 = text1;
        mtext2 = text2;
        mtext3 = text3;
    }

    public String getText1(){
        return mtext1;
    }

    public String getText2(){
        return mtext2;
    }

    public String getText3(){
        return mtext3;
    }


}
