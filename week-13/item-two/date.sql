select p.date1,max(p.url),max(p.count) as max from ((select date1,month(date1) as month1, year(date1) as year1, count(cs_uri_stem) as count,cs_uri_stem as url from logdata where sc_status=200 and cs_uri_stem NOT LIKE '%index%' GROUP BY date1,cs_uri_stem order by month1, year1) p) group by p.date1 order by p.date1;