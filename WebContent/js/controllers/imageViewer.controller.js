var app = angular.module('roomies');

app.controller('imageViewerController',['$interval',function($interval){
    this.imgSrc = 'images/img1.jpg';
    this.name = 'Akshat';
    
    var imagesSrcs = ['img1.jpg','img2.jpg','img3.jpg'];
    var self = this;
    var i = 1;
    var swapImage = function(){
        self.imgSrc = 'images/'+imagesSrcs[i];
        i++;
        if(i>2){
            i = 0;
        }
    }
    
    $interval(swapImage,4000);    
    
    
}]);