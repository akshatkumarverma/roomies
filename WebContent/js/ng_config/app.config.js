var app = angular.module('roomies', ['ui.router']);

app.config(function($stateProvider){
  var helloState = {
    name: 'hello',
    url: '/hello',
    template: '<h3>hello world!</h3>'
  }
  
  var aboutState = {
    name: 'about',
    url: '/about',
    template: '<h3>Its the UI-Router hello world app!</h3>'
  }
  
  $stateProvider.state(helloState);
  $stateProvider.state(aboutState);
});


app.directive('appHeader', function() {
  return {
    restrict: 'E',
    templateUrl: 'html/app-header.html'
  };
});

app.directive('appContent', function() {
  return {
    restrict: 'E',
    templateUrl: 'html/app-content.html'
  };
});

app.directive('appFooter', function() {
  return {
    restrict: 'E',
    templateUrl: 'html/app-footer.html'
  };
});

app.directive('imageViewer', function() {
  return {
    restrict: 'E',
    templateUrl: 'html/image-viewer.html'
  };
});