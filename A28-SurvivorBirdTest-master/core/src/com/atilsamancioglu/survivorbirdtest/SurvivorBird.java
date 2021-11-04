package com.atilsamancioglu.survivorbirdtest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;

import java.util.Random;

public class SurvivorBird extends ApplicationAdapter {

	SpriteBatch batch;
	Texture background;
	Texture bird;
	Texture monster1;
	Texture monster2;
	Texture monster3;

	float birdX = 0;
	float birdY = 0;
	int gameState = 0;
	float velocity = 0;
	float gravity = 0.7f;
	float enemyVelocity = 7;
	int score = 0;
	int scoredEnemy = 0;
	BitmapFont font1;
	BitmapFont font2;

	Circle birdCircle;

	ShapeRenderer shapeRenderer;

	int numberOfEnemies = 4;
	float [] enemyX = new float[numberOfEnemies];
	float [] enemyOffset1 = new float[numberOfEnemies];
	float [] enemyOffset2 = new float[numberOfEnemies];
	float [] enemyOffset3 = new float[numberOfEnemies];
	Random random;

	Circle[] enemyCircles1;
	Circle[] enemyCircles2;
	Circle[] enemyCircles3;

	float distanceX = 0;
	float distanceY = 0;

	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("background.png");
		bird = new Texture("bird.png");
		monster1 = new Texture("monster.png");
		monster2 = new Texture("monster.png");
		monster3 = new Texture("monster.png");

		distanceX = Gdx.graphics.getWidth() / 2;
		random = new Random();

		birdX = Gdx.graphics.getWidth() / 3 - bird.getWidth() / 3;
		birdY = Gdx.graphics.getHeight() / 2;

		//shapeRenderer = new ShapeRenderer();

		birdCircle = new Circle();
		enemyCircles1 = new Circle[numberOfEnemies];
		enemyCircles2 = new Circle[numberOfEnemies];
		enemyCircles3 = new Circle[numberOfEnemies];

		font1 = new BitmapFont();
		font1.setColor(Color.WHITE);
		font1.getData().setScale(4);

		font2 = new BitmapFont();
		font2.setColor(Color.WHITE);
		font2.getData().setScale(6);

		for (int i = 0; i < numberOfEnemies; i++) {

			enemyOffset1[i] = (random.nextFloat() - 0.5f) * (Gdx.graphics.getHeight() -200);
			enemyOffset2[i] = (random.nextFloat() - 0.5f) * (Gdx.graphics.getHeight() -200);
			enemyOffset3[i] = (random.nextFloat() - 0.5f) * (Gdx.graphics.getHeight() -200);
			System.out.println("random: " + enemyOffset1[i]);
			System.out.println("canavar boy: " + Gdx.graphics.getHeight());

			enemyX[i] = Gdx.graphics.getWidth() - Gdx.graphics.getWidth() / 30 + i * distanceX;

			enemyCircles1[i] = new Circle();
			enemyCircles2[i] = new Circle();
			enemyCircles3[i] = new Circle();

		}
	}

	@Override
	public void render () {

		batch.begin();
		batch.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

		if(gameState == 1 ){

			if(enemyX[scoredEnemy] < Gdx.graphics.getWidth() / 3 - bird.getWidth() / 3){
				score++;

				if(scoredEnemy < numberOfEnemies - 1) {
					scoredEnemy++;
				}else {
					scoredEnemy = 0;
				}

			}

			if(Gdx.input.justTouched() && birdY < Gdx.graphics.getHeight() - Gdx.graphics.getHeight()/8) {

				velocity = -13;

			}

			for(int i = 0; i < numberOfEnemies; i++) {


				if(enemyX[i] < Gdx.graphics.getWidth() / 30){
					enemyX[i] = enemyX[i] + numberOfEnemies * distanceX;

					enemyOffset1[i] = (random.nextFloat() - 0.5f) * (Gdx.graphics.getHeight() -200);
					enemyOffset2[i] = (random.nextFloat() - 0.5f) * (Gdx.graphics.getHeight() -200);
					enemyOffset3[i] = (random.nextFloat() - 0.5f) * (Gdx.graphics.getHeight() -200);

					System.out.println("random2: " + enemyOffset1[i]);

				}else {
					enemyX[i] = enemyX[i] - enemyVelocity;
				}



				batch.draw(monster1, enemyX[i], Gdx.graphics.getHeight()/2 + enemyOffset1[i], Gdx.graphics.getWidth() / 15, Gdx.graphics.getHeight() / 10);
				batch.draw(monster2, enemyX[i], Gdx.graphics.getHeight()/2 + enemyOffset2[i], Gdx.graphics.getWidth() / 15, Gdx.graphics.getHeight() / 10);
				batch.draw(monster3, enemyX[i], Gdx.graphics.getHeight()/2 + enemyOffset3[i], Gdx.graphics.getWidth() / 15, Gdx.graphics.getHeight() / 10);

				enemyCircles1[i] = new Circle(enemyX[i] + Gdx.graphics.getWidth() / 42, Gdx.graphics.getHeight()/2 + enemyOffset1[i] + Gdx.graphics.getHeight() / 20,Gdx.graphics.getWidth() / 46);
				enemyCircles2[i] = new Circle(enemyX[i] + Gdx.graphics.getWidth() / 42, Gdx.graphics.getHeight()/2 + enemyOffset2[i] + Gdx.graphics.getHeight() / 20,Gdx.graphics.getWidth() / 46);
				enemyCircles3[i] = new Circle(enemyX[i] + Gdx.graphics.getWidth() / 42, Gdx.graphics.getHeight()/2 + enemyOffset3[i] + Gdx.graphics.getHeight() / 20,Gdx.graphics.getWidth() / 46);

			}

			if(birdY > 0 ) {
				velocity = velocity + gravity;
				birdY = birdY - velocity;
			}else {
				gameState = 2;
			}

		}else if (gameState == 0){
			if(Gdx.input.justTouched()) {
				gameState = 1;
			}
		}else if (gameState == 2) {

			font2.draw(batch,"Game Over! Tap To Play Again!",100,Gdx.graphics.getHeight() / 2);

			if (Gdx.input.justTouched()) {
				gameState = 1;

				birdY = Gdx.graphics.getHeight() / 2;

				for (int i = 0; i < numberOfEnemies; i++) {

					enemyOffset1[i] = (random.nextFloat() - 0.5f) * (Gdx.graphics.getHeight() - 200);
					enemyOffset2[i] = (random.nextFloat() - 0.5f) * (Gdx.graphics.getHeight() - 200);
					enemyOffset3[i] = (random.nextFloat() - 0.5f) * (Gdx.graphics.getHeight() - 200);

					enemyX[i] = Gdx.graphics.getWidth() - Gdx.graphics.getWidth() / 30 + i * distanceX;

					enemyCircles1[i] = new Circle();
					enemyCircles2[i] = new Circle();
					enemyCircles3[i] = new Circle();

				}

				velocity = 0;
				scoredEnemy = 0;
				score = 0;
			}

		}
			batch.draw(bird, birdX, birdY, Gdx.graphics.getWidth() / 15, Gdx.graphics.getHeight() / 10);

			font1.draw(batch,String.valueOf(score),100,200);

			batch.end();

			birdCircle.set(birdX + Gdx.graphics.getWidth() / 26, birdY + Gdx.graphics.getHeight() / 20, Gdx.graphics.getWidth() / 45);

			//shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
			//shapeRenderer.setColor(Color.BLACK);
			//shapeRenderer.circle(birdCircle.x,birdCircle.y,birdCircle.radius);

			for (int i = 0; i < numberOfEnemies; i++) {
				//shapeRenderer.circle(enemyX[i] + Gdx.graphics.getWidth() / 42, Gdx.graphics.getHeight()/2 + enemyOffset1[i] + Gdx.graphics.getHeight() / 20,Gdx.graphics.getWidth() / 46);
				//shapeRenderer.circle(enemyX[i] + Gdx.graphics.getWidth() / 42, Gdx.graphics.getHeight()/2 + enemyOffset2[i] + Gdx.graphics.getHeight() / 20,Gdx.graphics.getWidth() / 46);
				//shapeRenderer.circle(enemyX[i] + Gdx.graphics.getWidth() / 42, Gdx.graphics.getHeight()/2 + enemyOffset3[i] + Gdx.graphics.getHeight() / 20,Gdx.graphics.getWidth() / 46);

				if (Intersector.overlaps(birdCircle, enemyCircles1[i]) || Intersector.overlaps(birdCircle, enemyCircles2[i]) || Intersector.overlaps(birdCircle, enemyCircles3[i])) {
					gameState = 2;
				}
			}

			//shapeRenderer.end();
		}


	@Override
	public void dispose () {

	}
}
