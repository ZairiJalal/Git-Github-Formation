class Animal {
    public static String getDefault(){
        return "Hello";
    }

    public static String getCatValue(){
        return "Cat";
    }
    
    public static void main(String[] args){
        String txt = getDefault();
        if(args[0].equals("Cat")){
            txt = getCatValue();
        }
        System.out.println(txt);
    }
}