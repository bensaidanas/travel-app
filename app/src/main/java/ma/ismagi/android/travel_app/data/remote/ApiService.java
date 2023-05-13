package ma.ismagi.android.travel_app.data.remote;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import ma.ismagi.android.travel_app.data.models.Country;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import ma.ismagi.android.travel_app.data.models.Country;

public class ApiService {
    private static final String BASE_URL = "http://localhost:3000/";
    private RequestQueue requestQueue;

    public ApiService(RequestQueue requestQueue) {
        this.requestQueue = requestQueue;
    }

    public void getCountries(Response.Listener<JSONArray> successListener, Response.ErrorListener errorListener) {
        String url = BASE_URL + "countries";
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, successListener, errorListener);
        requestQueue.add(request);
    }

    public void getCountryById(int id, Response.Listener<JSONObject> successListener, Response.ErrorListener errorListener) {
        String url = BASE_URL + "countries/" + id;
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, successListener, errorListener);
        requestQueue.add(request);
    }

    public void addToFavorites(Country country, Response.Listener<JSONObject> successListener, Response.ErrorListener errorListener) {
        String url = BASE_URL + "countries/" + country.getId() + "/favorites";
        JSONObject requestBody = new JSONObject();
        try {
            requestBody.put("isFavorite", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.PUT, url, requestBody, successListener, errorListener);
        requestQueue.add(request);
    }

    public void removeFromFavorites(Country country, Response.Listener<JSONObject> successListener, Response.ErrorListener errorListener) {
        String url = BASE_URL + "countries/" + country.getId() + "/favorites";
        JSONObject requestBody = new JSONObject();
        try {
            requestBody.put("isFavorite", false);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.PUT, url, requestBody, successListener, errorListener);
        requestQueue.add(request);
    }

    public void markPlaceAsVisited(int placeId, boolean isVisited, Response.Listener<JSONObject> successListener, Response.ErrorListener errorListener) {
        String url = BASE_URL + "places/" + placeId;
        JSONObject requestBody = new JSONObject();
        try {
            requestBody.put("isVisited", isVisited);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.PUT, url, requestBody, successListener, errorListener);
        requestQueue.add(request);
    }
}
