package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    //surcharge
    boolean customerWantsCondiments(){
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput()  {
        System.out.println("wants condiments ? (y/n)");
        String answer = null ;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(answer == null){
            return "no";
        }

        return answer;

    }
}

