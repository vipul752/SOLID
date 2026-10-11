int multiply(int a,int b) {
    return a * b;
}
void main() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = multiply(a, b);
    System.out.println("answer is " + ans);
}

