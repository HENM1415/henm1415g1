$(document).ready(function () {
  init();
});

function init() {
  initEvents();
}

function initEvents() {
  $("#loginPanelButton").click(openLoginPanel);
  $("#loginPanelCloseButton").click(closeLoginPanel);
  $("#loginButton").click(function(){

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