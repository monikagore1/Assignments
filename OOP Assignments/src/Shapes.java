// 5. draw shapes
public abstract class Shapes {
	abstract void draw();
	
}
class Line extends Shapes
{
void draw()
{
	System.out.println("draw line shape");
}}
class Rectangle extends Shapes
{
	void draw()
	{
		System.out.println("draw rectangle shape");
	}}
	class Cube extends Shapes
	{
		void draw()
		{
			System.out.println("draw cube shape");
		}

	public static void main(String[] args) {

		Line l=new Line();
		l.draw();
		Rectangle r=new Rectangle();
		r.draw();
		Cube c=new Cube();
		c.draw();

	}

}
