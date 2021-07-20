<?php
    require_once('account.php');
    class Car{
        private $id;
        private $licence;
        private $driver;
        private $passenger;

        public function __construct($licence, $driver){
            $this->licence = $licence;
            $this->driver = $driver;
        }
        public function getPassenger() {
            return $this->passenger;
        }

        public function setPassenger($passenger) {
        
            if ($passenger == 4) {
                $this->passenger = $passenger;
            }
            else {
                echo "Necesitas asignar 4 pasajeros";
            }
        
        }
        

    }


?>

    