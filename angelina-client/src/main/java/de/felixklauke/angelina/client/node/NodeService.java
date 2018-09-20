package de.felixklauke.angelina.client.node;

import de.felixklauke.angelina.client.model.DataHolder;
import de.felixklauke.angelina.client.model.NodeData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

import java.util.List;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface NodeService {

    @GET("nodes")
    Call<DataHolder<List<NodeData>>> getNodes(@Header("Cookie") String auth);
}
