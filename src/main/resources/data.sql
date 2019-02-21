insert into user(id, username, user_type)
values (1, 'Manuel', 'DRIVER');

insert into user(id, username, user_type)
values (2, 'Pedro', 'DRIVER');

insert into user(id, username, user_type)
values (3, 'Juan', 'PASSENGER');


insert into trip(id, max_pax, description, start_time, end_time, or_latitude, or_longitude, dest_latitude,
dest_longitude, route, driver_id)
values (1, 4, 'Barcelona - Martorell', 1551168000000, 1551171600000, 41.38074, 2.18594, 41.49958, 1.90307,
'sdq{Fc}iLj@zR|W~TryCzvC??do@jkKeiDxjIccLhiFqiE`uJqe@rlCy~B`t@sK|i@', 1);

insert into trip(id, max_pax, description, start_time, end_time, or_latitude, or_longitude, dest_latitude,
dest_longitude, route, driver_id)
values (2, 6, 'Barcelona - Sant Cugat', 1551168000000, 1551171600000, 41.38074, 2.18594, 41.46693, 2.08006,
'sdq{Fc}iLeoBrgBs@xsGecD|sEswEv|Cek@cyA', 2);

insert into trip(id, max_pax, description, start_time, end_time, or_latitude, or_longitude, dest_latitude,
dest_longitude, route, driver_id)
values (3, 4, 'Martorell - Barcelona', 1551193200000, 1551196800000, 41.49958, 1.90307, 41.38074, 2.18594,
'sdq{Fc}iLj@zR|W~TryCzvC??do@jkKeiDxjIccLhiFqiE`uJqe@rlCy~B`t@sK|i@', 1);

insert into trip(id, max_pax, description, start_time, end_time, or_latitude, or_longitude, dest_latitude,
dest_longitude, route, driver_id)
values (4, 6, 'Sant Cugat - Barcelona', 1551193200000, 1551196800000, 41.46693, 2.08006, 41.38074, 2.18594,
'sdq{Fc}iLeoBrgBs@xsGecD|sEswEv|Cek@cyA', 2);


insert into stop(id, stop_time, stop_status, latitude, longitude, passenger_id, trip_id)
values (1, 1551170400000, 'ACCEPTED', 41.43853, 2.00094, 3, 1);

insert into stop(id, stop_time, stop_status, latitude, longitude, passenger_id, trip_id)
values (2, 1551195000000, 'ACCEPTED', 41.37653, 2.17924, 3, 3);