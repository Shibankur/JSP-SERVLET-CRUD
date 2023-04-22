/**
 * 
 */
package net.javaguides.usermanagement.util;

/**
 * @author ShibankurD
 *
 */
public interface SqlQueryConstant {

	static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (id, name, email, country) VALUES " +
			" (?, ?, ?,?);";

	static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
	static final String SELECT_ALL_USERS = "select * from users";
	static final String DELETE_USERS_SQL = "delete from users where id = ?;";
	static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

}
