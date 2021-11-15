class Circle_01
{
	public  int r = 5;
	public static double R=3.14;

	public  void Circle1() 
	{  
		System.out.println("AREA OF CIRCLE ONE : "+R*r*r);
	}
}
class Circle_02
{
	public  int r = 7;
	
	public  void Circle2() 
	{
            Circle_01 p = new Circle_01();
			System.out.println("AREA OF CIRCLE TWO : "+p.R*r*r);
	}
}
class Circle_03
{
	public  int r = 12;
	

	public  void Circle3() 
	{
		Circle_01 p = new Circle_01();
			System.out.println("AREA OF CIRCLE THREE : "+p.R*r*r);
	}
}
class Circle_04
{ 
	public  int r = 6;
	public  void Circle4() 
	{
		Circle_01 p = new Circle_01();
		System.out.println("AREA OF CIRCLE FOUR : "+p.R*r*r);
	}
}
class CircleMain_01
{
	public static void main(String[] args) 
	{

		System.out.println("START MAIN METHOD");

        Circle_01 obj = new  Circle_01();
        obj.Circle1();

        Circle_02 obj1 = new  Circle_02();
		obj1.Circle2();

		Circle_03 obj2 = new Circle_03();
		obj2.Circle3();

		Circle_04 obj3 = new Circle_04();
		obj3.Circle4();

	
     
	    System.out.println("END MAIN METHOD");
	}
}
