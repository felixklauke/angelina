package de.felixklauke.angelina.client.auth;

import de.felixklauke.angelina.client.model.AuthenticationModel;
import de.felixklauke.angelina.client.model.DataHolder;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface AuthService {

    @POST("access/ticket")
    Call<DataHolder<AuthenticationModel.AuthenticationData>> getTicketAndCSRFToken(@Query("username") String userName, @Query("password") String password);
}
