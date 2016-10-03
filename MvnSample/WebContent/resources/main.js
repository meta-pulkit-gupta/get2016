var listCars = angular.module('listCars', []);

listCars.controller('carController', function($scope, $http) {
	$scope.carLoad = $http({
		method : 'GET',
		url : 'ListCars'
	}).then(function(response) {
		$scope.cars = response.data;
	});
});

var saveCar = angular.module('saveCar', []);

saveCar.controller('formController', function($scope, $http) {
	$scope.getCarInformation = function(pageType, id) {
		if (pageType === "Edit") {
			$scope.carLoad = $http({
				method : 'GET',
				url : 'EditCar?id=' + id
			}).then(function(response) {
				$scope.car = response.data;
			});
		} else if (pageType === "View") {
			$('input').attr('readonly', 'readonly'); 
			console.log("dsajd");
			$scope.carLoad = $http({
				method : 'GET',
				url : 'viewCar?id=' + id
			}).then(function(response) {
				$scope.car = response.data;
			});
		}
	}
});
