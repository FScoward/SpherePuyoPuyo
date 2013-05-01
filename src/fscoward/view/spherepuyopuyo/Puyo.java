package fscoward.view.spherepuyopuyo;

interface Puyo {
	enum Sphere {HARUKA, MINAKO, AYAHI, AKI};
	
	// 移動動
	public void move();
	// 回転
	public void rotate();
	//　消滅
	public void eliminate();
	
	String color = null;
	
}
