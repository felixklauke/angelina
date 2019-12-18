package de.felixklauke.angelina.api.auth;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface Authentication {

  String getUserName();

  String getCSRFToken();

  String getTicket();
}
