package fscoward.view.spherepuyopuyo;

interface Puyo {
	enum Sphere {HARUKA, MINAKO, AYAHI, AKI};
	
	// ˆÚ“®“®
	public void move();
	// ‰ñ“]
	public void rotate();
	//@Á–Å
	public void eliminate();
	
	String color = null;
	
}
