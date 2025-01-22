SELECT count(*)
from USER_INFO 
where JOINED like concat('2021','%') and AGE between 20 and 29;