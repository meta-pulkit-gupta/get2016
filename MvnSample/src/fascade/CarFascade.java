package fascade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vo.Car;

import dao.CarDAO;

@Service("carFascade")
public class CarFascade {

	public CarDAO carDAO;

	public CarDAO getCarDAO() {
		return carDAO;
	}

	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}

	/**
	 * save the car
	 * 
	 * @param car
	 * @return boolean true if the car is saved else false.
	 */
	public boolean saveCar(Car car) {
		return carDAO.saveCar(car);
	}

	/**
	 * Get all the cars present.
	 * 
	 * @return ResultSet list of all the cars.
	 */
	public List<Car> getCars() {
		ResultSet rs = carDAO.getCars();
		List<Car> cars = new ArrayList<Car>();
		try {
			Car car;
			while (rs.next()) {
				car = new Car(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getFloat(5), rs.getFloat(6),
						rs.getInt(7), rs.getFloat(8), rs.getString(9),
						rs.getString(10), rs.getString(11));
				cars.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	/**
	 * Get the car with the specific Id.
	 * 
	 * @param id
	 *            id of a car
	 * @return ResultSet list of car.
	 */
	public Car getCarById(int id) {
		ResultSet rs = carDAO.getCarById(id);
		Car car = null;
		try {
			while (rs.next()) {
				car = new Car(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getFloat(5), rs.getFloat(6),
						rs.getInt(7), rs.getFloat(8), rs.getString(9),
						rs.getString(10), rs.getString(11));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return car;
	}
}
