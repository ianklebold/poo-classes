<?php
    require_once('car.php');
    class UberVan extends Car{
        public $typeCardAccepted;
        public $seatsMaterial;

        public function __construct($licence, $driver,$typeCardAccepted, 
                                    $seatsMaterial){
            parent::__construct($licence, $driver);

            $this->typeCardAccepted = $typeCardAccepted;
            $this->seatsMaterial = $seatsMaterial;
        }

        public function setPassenger($passenger) {
    
            if ($passenger == 6) {
                $this->passenger = $passenger;
            }
            else {
                echo "Necesitas asignar 6 pasajeros";
            }
        
        }


        
    }
?>