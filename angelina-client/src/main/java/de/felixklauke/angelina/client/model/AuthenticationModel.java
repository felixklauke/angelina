package de.felixklauke.angelina.client.model;

import de.felixklauke.angelina.api.auth.Authentication;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
@RequiredArgsConstructor
@ToString
public class AuthenticationModel implements Authentication {

    private AuthenticationData data;

    @Override
    public String getUserName() {

        return data.getUsername();
    }

    @Override
    public String getCSRFToken() {

        return data.getCSRFPreventionToken();
    }

    @Override
    public String getTicket() {

        return data.getTicket();
    }

    @Data
    @ToString
    public static class AuthenticationData {

        private String ticket;
        private String username;
        private String CSRFPreventionToken;
    }
}
