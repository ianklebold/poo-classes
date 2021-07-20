<?php
    require_once('car.php');
    class UberBlack extends Car{
        public $typeCardAccepted;
        public $seatsMaterial;

        public function __construct($typeCardAccepted, 
                                    $seatsMaterial){
            parent::__construct($licence, $driver);

            $this->typeCardAccepted = $typeCardAccepted;
            $this->seatsMaterial = $seatsMaterial;
        }
    }
?>