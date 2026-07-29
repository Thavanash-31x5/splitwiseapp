package splitwiseapp;

public class Friend {
    private final String name;
    private static int lastId =0;
    private final int id;

    public Friend(String name){

        lastId++;
        this.id = lastId;
        this.name=name;
    }

    public String getName(){

        return this.name;
    }

    public int getId(){
         return this.id;
    }


}
