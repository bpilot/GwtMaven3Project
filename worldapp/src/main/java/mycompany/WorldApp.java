package com.mycompany.app;

import sharedlibrary.client.HappyFuture;

/**
 * Hello world!
 *
 */
public class WorldApp 
{
    public static void main( String[] args )
    {
        System.out.println( "WorldApp!" );

        HappyFuture happyFuture = new HappyFuture();
        happyFuture.happinessFactory();

    }
}
