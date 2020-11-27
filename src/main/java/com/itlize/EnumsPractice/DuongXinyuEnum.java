package com.itlize.EnumsPractice;


enum DuongXinyuEnum{
    Duong,
    Xinyu;

    public String getCatchPhrase(){
        switch (this){
            case Duong:
                return "Hey, my name is Duong!";
            case Xinyu:
                return "Hey, my name is Xinyu!";
            default:
                return null;
        }
    }
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

