package com.company.http;

public class Model1036 {
    String[] state = "X_X_X_ _o_o_o".split("_");
    String[] standard = "X_X_ _X_o_o_o".split("_");

    int emptyPosition = 3;

    boolean end = false;
    public void logic(int move){
        int allowedMin;
        int allowedMax;
        if (emptyPosition > 1) {
            allowedMin = emptyPosition - 2;
        } else {
            allowedMin = 0;
        }
        if (emptyPosition < 5) {
            allowedMax = emptyPosition + 2;
        } else {
            allowedMax = 6;
        }
        if (move < allowedMin || allowedMax < move || move == emptyPosition) {
            System.out.printf("Укажите позицию от %d до %d, исключая %d\n", allowedMin, allowedMax, emptyPosition);
            return;
        }
        state[emptyPosition] = state[move];
        state[move] = " ";
        emptyPosition = move;
        System.out.println("0123456");
        int i = 0;
        boolean correct = true;
        while (i < state.length) {
            if (!state[i].equals(standard[i])) {
                correct = false;
                break;
            }
            i++;
        }
        if (correct) {
            end = true;
        }
    }


    public String[] getState(){
        return state;
    }

    public Boolean canWork(){
        return end;
    }
}
