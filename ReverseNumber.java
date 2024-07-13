//reverse a number wihout using for loop
public class ReverseNumber{
public static void main(String args[]){
long num=8147387541L;
long reverse=0;
/*while(num!=0){
	int rem=num % 10;
	reverse=reverse * 10 +rem;
	System.out.println("reverse:"+reverse+""+"rem"+rem);
	num=num/10;
	
}*/
for(long rem=num%10;rem<=num;rem++){
	reverse=reverse * 10 +rem;
	num=num/10;
}
 
System.out.println("reverse number is:"+reverse);

}



}