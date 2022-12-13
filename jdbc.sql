1. select * from customer where custid not in (select custid from bill);

2. select a.pname,a.price,b.catname from product a  join category b on b.catid = a.catid where price = 
(select max(price) from product);

3. select a.pname,a.price,b.catname from product a  join category b on b.catid = a.catid where price = 
(select min(price) from product);

4. select a.catname as category_name,c.catname as product_name,e.compname as company_name  from 
category a left join category c on c.pcatid = a.catid left join product b on b.catid = a.catid 
left join company e on b.compid = e.compid;

5. select a.billitemid,b.date,d.custname,c.pname,e.catname,c.price,a.qty,a.price,c.mfdate,c.expdate,
f.compname from billitem  a join  bill b on b.billno = a.billno join  product c on  c.pid = a.prodid
join customer d on d.custid = b.custid join category  e on e.catid = c.catid
join company f on f.compid = c.compid order by b.date;

6. select a.billitemid,b.date,d.custname,c.pname,e.catname,c.price,a.qty,a.price,sum(a.price)as total_spent,c.mfdate,c.expdate,f.compname from billitem  a
join  bill b on b.billno = a.billno join  product c on  c.pid = a.prodid
join customer d on d.custid = b.custid join category  e on e.catid = c.catid
join company f on f.compid = c.compid group by a.billitemid;

7. select a.compname,count(pid) from company a   join product b on b.compid = a.compid   group by a.compname;

8. select a.catname as category_name,c.catname as product_name,e.compname as company_name ,count(b.pid) as item_count from category a
left join category c on c.pcatid = a.catid
left join product b on b.catid = a.catid
left join company e on b.compid = e.compid
group by e.compname,a.catname,c.catname;

9.select c.custname,count(pid) from product pr
join customer c on c.custid=pr.custid; -----

10. select a.billitemid,b.date,c.pname,a.qty,a.price as total_price,sum(a.qty)as total_sales,f.compname from billitem  a
join  bill b on b.billno = a.billno
join  product c on  c.pid = a.prodid
join company f on f.compid = c.compid
group by a.billitemid;

11.select a.billitemid,d.custname,c.pname,e.catname,a.qty as total_items from billitem  a
join  bill b on b.billno = a.billno
join  product c on  c.pid = a.prodid
join customer d on d.custid = b.custid
join category  e on e.catid = c.catid
group by a.billitemid;

