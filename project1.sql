create table table1 (
	column1 varchar(100),
	column2 int(10),
	column3 date,
	column4 blob
);


create table basic (
	seq 		int(10),
	title 		varchar(300),
	contents 	varchar(2000),
	file_yn		varchar(1),
	image_yn	varchar(1),
	--video_yn	varchar(1),
	regdate		date,
	up_date	date,
	writer		varchar(50),
	del_yn		varchar(1)
);

create table file(
	seq			int(10),		--basic.seq
	f_seq		int(10),
	f_blob		blob
);

create table image(
	seq			int(10),		--basic.seq
	i_seq		int(10),
	i_path		varchar(500)
);

create table reply(
	seq			int(10),		--basic.seq
	r_seq		int(10),
	rr_seq		int(10),		--0 원댓글, 1 대댓
	r_contents	varchar(1000),
	r_regdate	date,
	r_up_date	date,
	r_writer	varchar(50)
);

