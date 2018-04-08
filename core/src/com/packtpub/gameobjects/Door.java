package com.packtpub.gameobjects;

/**
 * Created by Jaibe on 03-04-2018.
 */

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Door {
    public Sprite openSprite;
    public Sprite closeSprite;
    public boolean isOpen = false;
    public boolean isGoat = false; // indicates whether a goat is behind the door

    public Vector2 position  = new Vector2();

    public float height;
    public float width;

    public void render(SpriteBatch batch){
        if(isOpen){
            openSprite.draw(batch);
        }
        else {
            closeSprite.draw(batch);
        }

    }
}