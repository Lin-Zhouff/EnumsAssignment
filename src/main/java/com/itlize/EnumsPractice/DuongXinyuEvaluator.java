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
    DuongXinyuEnum x;
    public DuongXinyuEvaluator(String input){
        this.name = input;
    }
    public boolean isDuong(){
        return this.name.equals(x.Duong.name());
    }
    public boolean isXinyu(){
        return this.name.equals(x.Xinyu.name());
    }

}
