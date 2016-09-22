var mobile = angular.module('mobile', []);
mobile.controller('mobileCtrl', function($scope, $http){
  $http.get('phones.json').then(function(response) {
       $scope.mobile = response.data;
   });
});
