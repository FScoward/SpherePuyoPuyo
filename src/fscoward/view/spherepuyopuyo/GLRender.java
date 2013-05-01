package fscoward.view.spherepuyopuyo;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.graphics.Color;
import android.graphics.Paint;
import android.opengl.GLSurfaceView.Renderer;

public class GLRender implements Renderer {

	@Override
	public void onDrawFrame(GL10 gl) {
		// TODO Auto-generated method stub
		// 描画系
		/*
		 * onDrawFrame() メソッドはすべてのフレームに呼び出され、シーンの描画を担っています。
		 * 通常は glClear を呼び出してフレームバッファのクリアを行うことから始め、後続で他の OpenGL ES を呼び出して現在のシーンを描画することになります。
		 * */
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT); // 色と深度をクリア
		Paint paint = new Paint();
		paint.setStrokeWidth(2);
		paint.setColor(Color.argb(255, 255, 0, 0));//赤セット

	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		// TODO Auto-generated method stub
		// surface が変更された時の処理
		/*
		 * onSurfaceChanged() メソッドはサーフェスがサイズを変更したときに呼び出されます。これは OpenGL ビューポートを設定するのに最適な場所です。
		 * また、動き回ったりしない固定のカメラなどはここで設定したくなるでしょう。
		 * */
		gl.glViewport(0, 0, width, height);
	}

	@Override
	public void onSurfaceCreated(GL10 arg0, EGLConfig arg1) {
		// TODO Auto-generated method stub
		// 開始時の処理
		/*
		 * onSurfaceCreated() メソッドはレンダリングの開始時点と、 OpenGL ES 描画コンテキストが再生成さたとき常に呼び出されます ( 通常はアクティビティが一時停止と回復したときに描画コンテキストが失われたり再生成されたりします ) 。
		 * テクスチャといった長い間生存している OpenGL リソースを生成するのに OnSurfaceCreated() は最適な場所です。
		 * */

	}

}
