<?php

    require_once('car.php');
    require_once('uberX.php');
    require_once('account.php');


    $uberX = new UberX("CVB1234", new Account("Andres Herrera", "41840491"), 
                      "Chevrolet", "Spark");
    echo "Licence : ". $uberX->parent->licence . "driver : " . $uberX->$car->$driver->name;
    echo "Brand : " . $uberX->brand . " Model :" .$uberX->model;



?>