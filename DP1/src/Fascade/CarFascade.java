package Fascade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.VO.Car;

import dao.CarDAO;

public class CarFascade {

	public boolean saveCar(Car car) {
		CarDAO carDAO = CarDAO.getCarDAO();
		return carDAO.saveCar(car);
	}

	public List<Car> getCars() {
		CarDAO carDAO = CarDAO.getCarDAO();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cars;
	}
	
	public Car getCarById(int id){
		CarDAO carDAO = CarDAO.getCarDAO();
		ResultSet rs = carDAO.getCarById(id);
		Car car = null;
		try {
			while(rs.next()){
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
