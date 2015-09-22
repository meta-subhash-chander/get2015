-- create database vehicle management
CREATE DATABASE vehicleManagement;
-- for use databade vehiclemanagement
USE vehicleManagement;
-- create table vehicle
-- for insert common attribute of vehicle 
CREATE TABLE vehicle (
    vehicleId DOUBLE PRIMARY KEY,
    make VARCHAR (50),
    model VARCHAR (50),
    engineInCC INT, 
    fuelCapacity INT,
    mileage INT,
    price FLOAT,
    roadTax FLOAT 
    );
  -- create table car
  -- for insert accessaries of cars 
CREATE TABLE car (
    vehicleId DOUBLE,
    ac VARCHAR(10),
    powerSteering VARCHAR(10),
    accessoryKit VARCHAR(100),
    FOREIGN KEY(vehicleId) REFERENCES vehicle (vehicleId)
    ON DELETE CASCADE ON UPDATE CASCADE
    );

-- create table bike
-- insert attribute of bike
CREATE TABLE bike (
    vehicleId DOUBLE,
    selfStart VARCHAR (10),
	  helmetPrice INT,
    FOREIGN KEY(vehicleId) REFERENCES vehicle (vehicleId)
    ON DELETE CASCADE ON UPDATE CASCADE
    );
