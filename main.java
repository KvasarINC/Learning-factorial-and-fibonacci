class Programm {

public static void main(String[] args {

System.out.println(fuctorial(5));

}

public static int fuctorial(int n) {

if(n == 1) {
return 1;
}
return n*fuctorial(n-1);

}

}
