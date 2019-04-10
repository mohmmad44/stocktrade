
create table model_output(
id integer not null auto_increment,
date_Str varchar(30) not null,
time_stamp varchar(30) not null,
security_name varchar(255) not null,
ISIN varchar(30) not null,
yesterday_actual decimal(20,5) not null,
NGT_PUBLISHED decimal(20,5) not null,
Model_Now decimal(20,5) not null,
Model_EoD decimal(20,5) not null,
primary key (id)
)
