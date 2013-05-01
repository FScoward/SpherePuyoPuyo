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
		// �`��n
		/*
		 * onDrawFrame() ���\�b�h�͂��ׂẴt���[���ɌĂяo����A�V�[���̕`���S���Ă��܂��B
		 * �ʏ�� glClear ���Ăяo���ăt���[���o�b�t�@�̃N���A���s�����Ƃ���n�߁A�㑱�ő��� OpenGL ES ���Ăяo���Č��݂̃V�[����`�悷�邱�ƂɂȂ�܂��B
		 * */
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT); // �F�Ɛ[�x���N���A
		Paint paint = new Paint();
		paint.setStrokeWidth(2);
		paint.setColor(Color.argb(255, 255, 0, 0));//�ԃZ�b�g

	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		// TODO Auto-generated method stub
		// surface ���ύX���ꂽ���̏���
		/*
		 * onSurfaceChanged() ���\�b�h�̓T�[�t�F�X���T�C�Y��ύX�����Ƃ��ɌĂяo����܂��B����� OpenGL �r���[�|�[�g��ݒ肷��̂ɍœK�ȏꏊ�ł��B
		 * �܂��A����������肵�Ȃ��Œ�̃J�����Ȃǂ͂����Őݒ肵�����Ȃ�ł��傤�B
		 * */
		gl.glViewport(0, 0, width, height);
	}

	@Override
	public void onSurfaceCreated(GL10 arg0, EGLConfig arg1) {
		// TODO Auto-generated method stub
		// �J�n���̏���
		/*
		 * onSurfaceCreated() ���\�b�h�̓����_�����O�̊J�n���_�ƁA OpenGL ES �`��R���e�L�X�g���Đ��������Ƃ���ɌĂяo����܂� ( �ʏ�̓A�N�e�B�r�e�B���ꎞ��~�Ɖ񕜂����Ƃ��ɕ`��R���e�L�X�g������ꂽ��Đ������ꂽ�肵�܂� ) �B
		 * �e�N�X�`���Ƃ����������Ԑ������Ă��� OpenGL ���\�[�X�𐶐�����̂� OnSurfaceCreated() �͍œK�ȏꏊ�ł��B
		 * */

	}

}
