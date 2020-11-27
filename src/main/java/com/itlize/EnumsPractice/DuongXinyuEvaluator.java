package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    enum DuongXinyuEnum{
        Duong,
        Xinyu;
        public Boolean isDuong(){
            switch (this) {
                case Duong:
                    return true;
                default:
                    return false;
            }
        }
        public boolean isXinyu(){
            switch (this) {
                case Xinyu:
                    return true;
                default:
                    return false;
            }
        }
    }

    private String name;

    public DuongXinyuEvaluator(String input){
        this.name = input;
    }



}
