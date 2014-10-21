$(document).ready(function () {
  init();
});

function init() {
  initEvents();
}

function initEvents() {
    var APP_NAME = 'AlmostPerfect';
  $("#loginPanelButton").click(openLoginPanel);
  $("#loginPanelCloseButton").click(closeLoginPanel);
  $("#loginButton").click(function(){
    //Send a request with the data from the Login panel.
    $.ajax({
        method: 'POST',
        //dataType: 'json',
        url: 'authentication',
        data: {username: $('#nameField').val(), password: $('#passwordField').val()},
        success: function(resp) {
            console.log(JSON.parse(resp));
        },
        error: function(resp) {
            console.log('error', resp);
        }
    });
    closeLoginPanel();
  });

  $("#registerButton").click(function () {

    closeLoginPanel();
  });

}

function openLoginPanel(){
  $("#loginPanel").show();
  $("#nameField").focus();
}
function closeLoginPanel(){
  $("#loginPanel").hide();
}

// Get user position and then call the callback function passing it the lat and lng.
function getUserPosition(callback) {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(function(position) {
            var coords = {lat: position.coords.latitude, lng: position.coords.longitute};
            callback(coords);
        });
    } else {
        alert('Unfortunately, Your browser is outdated and we cannot detect Your position!');
    }
};