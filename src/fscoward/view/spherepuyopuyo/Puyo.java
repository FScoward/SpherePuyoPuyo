package fscoward.view.spherepuyopuyo;

interface Puyo {
	enum Sphere {HARUKA, MINAKO, AYAHI, AKI};
	
	// �ړ���
	public void move();
	// ��]
	public void rotate();
	//�@����
	public void eliminate();
	
	String color = null;
	
}
