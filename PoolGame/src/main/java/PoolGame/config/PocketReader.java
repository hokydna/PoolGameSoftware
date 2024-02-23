package PoolGame.config;

import PoolGame.GameManager;
import PoolGame.objects.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class PocketReader implements Reader {

	/**
	 * Parses the JSON file and builds the pockets.
	 * 
	 * @param path        The path to the JSON file.
	 * @param gameManager The game manager.
	 */
    public void parse(String path,GameManager gameManager){
        JSONParser parser = new JSONParser();
		ArrayList<Pocket> pockets = new ArrayList<Pocket>();

		try {
			Object object = parser.parse(new FileReader(path));

			// convert Object to JSONObject
			JSONObject jsonObject = (JSONObject) object;

			// read Table JSONObject
			JSONObject jsonTable = (JSONObject) jsonObject.get("Table");

			// reading the "Pockets" array:
			JSONArray jsonPockets = (JSONArray) jsonTable.get("pockets");


			// reading from the array:
			for (Object obj : jsonPockets) {
                JSONObject jsonPocket = (JSONObject) obj;
                Double positionX = (Double) ((JSONObject) jsonPocket.get("position")).get("x");
				Double positionY = (Double) ((JSONObject) jsonPocket.get("position")).get("y");  
                Double radius = (Double) jsonPocket.get("radius");
				Pocket pocket = new Pocket(positionX, positionY);
				pocket.setRadius(radius);
				pockets.add(pocket);

            }
			
			gameManager.getTable().setPockets(pockets);
        }  catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
}
