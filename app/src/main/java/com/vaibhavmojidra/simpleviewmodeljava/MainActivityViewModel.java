package com.vaibhavmojidra.simpleviewmodeljava;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int result=0;
    public int getResult(){
        return  result;
    }
    public int updateResult(int val){
        result+=val;
        return result;
    }
}
