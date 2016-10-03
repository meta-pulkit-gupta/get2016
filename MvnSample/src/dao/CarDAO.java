package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.utills.Connector;
import com.utills.Queries;
import com.vo.Car;

@Repository
public class CarDAO {

	private static PreparedStatement statement;

	/**
	 * Create a tuple of car object in the database.
	 * 
	 * @param car
	 *            Object of car
	 * @return true if the car is saved else false.
	 */
	public boolean saveCar(Car car) {
		Connection connection = Connector.getConnection();
		int id = 0;
		try {
			statement = connection.prepareStatement(Queries.SAVE_VEHICLE,
					PreparedStatement.RETURN_GENERATED_KEYS);
			statement.setString(1, car.getCompany());
			statement.setString(2, car.getModel());
			statement.setInt(3, car.getEngineInCC());
			statement.setFloat(4, car.getFuelCapacity());
			statement.setFloat(5, car.getMilage());
			statement.setInt(6, car.getPrice());
			statement.setFloat(7, car.getRoadTax());
			if (statement.executeUpdate() != 1) {
				return false;
			}
			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				id = rs.getInt(1);
			}
			statement = connection.prepareStatement(Queries.SAVE_CAR);
			statement.setInt(1, id);
			statement.setString(2, car.getAc());
			statement.setString(3, car.getPowerSteering());
			statement.setString(4, car.getAccessoryKit());
			if (statement.executeUpdate() != 0) {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Some exception occured!!");
			e.printStackTrace();
		}
		return true;
	}
	
	/**
	 * Get all the cars present.
	 * @return ResultSet list of all the cars.
	 */

	public ResultSet getCars() {
		ResultSet rs = null;
		Connection connection = Connector.getConnection();
		try {
			statement = connection.prepareStatement(Queries.GET_CARS);
			rs = statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * Get the car with the specific Id.
	 * @param id id of a car
	 * @return  ResultSet list of car.
	 */
	public ResultSet getCarById(int id) {
		ResultSet rs = null;
		Connection connection = Connector.getConnection();
		try {
			statement = connection.prepareStatement(Queries.GET_CAR_BY_ID);
			statement.setInt(1, id);
			rs = statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public boolean editCar(Car car) {

		return true;
	}
}
