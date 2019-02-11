insert into user(id, username, user_type)
values (1, 'Manuel', 'DRIVER');

insert into user(id, username, user_type)
values (2, 'Pedro', 'DRIVER');

insert into user(id, username, user_type)
values (3, 'Juan', 'PASSENGER');


insert into trip(id, max_pax, description, start_time, end_time, or_latitude, or_longitude, dest_latitude,
dest_longitude, route, driver_id)
values (1, 4, 'Barcelona - Martorell', 1234535, 1234124, 10.0011, 2.19, 11.0011, 3.19,
'sdq{Fc}iLj@zR|W~TryCzvC??do@jkKeiDxjIccLhiFqiE`uJqe@rlCy~B`t@sK|i@', 1);

insert into trip(id, max_pax, description, start_time, end_time, or_latitude, or_longitude, dest_latitude,
dest_longitude, route, driver_id)
values (2, 6, 'Barcelona - Sant Cugat', 1234535, 1234124, 10.0011, 2.19, 11.0011, 3.19,
'sdq{Fc}iLeoBrgBs@xsGecD|sEswEv|Cek@cyA', 2);

insert into trip(id, max_pax, description, start_time, end_time, or_latitude, or_longitude, dest_latitude,
dest_longitude, route, driver_id)
values (3, 4, 'Martorell - Barcelona', 1234535, 1234124, 10.0011, 2.19, 11.0011, 3.19,
'sdq{Fc}iLj@zR|W~TryCzvC??do@jkKeiDxjIccLhiFqiE`uJqe@rlCy~B`t@sK|i@', 1);

insert into trip(id, max_pax, description, start_time, end_time, or_latitude, or_longitude, dest_latitude,
dest_longitude, route, driver_id)
values (4, 6, 'Sant Cugat - Barcelona', 1234535, 1234124, 10.0011, 2.19, 11.0011, 3.19,
'sdq{Fc}iLeoBrgBs@xsGecD|sEswEv|Cek@cyA', 2);


insert into stop(id, stop_time, stop_status, latitude, longitude, passenger_id, trip_id,)
values (1, 123124, 'ACCEPTED', 10.0011, 2.19, 3, 2);

insert into stop(id, stop_time, stop_status, latitude, longitude, passenger_id, trip_id)
values (2, 123124, 'ACCEPTED', 1.0011, 2.19, 3, 3);