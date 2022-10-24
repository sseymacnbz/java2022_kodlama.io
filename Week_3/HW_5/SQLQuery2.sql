-- SELECT
SELECT * FROM Customers /* * demek tüm kolonları getir anlamında */
SELECT ContactName, CompanyName, City FROM Customers -- Çalıştırmak istediğin satırı seçip soldaki Execute butonuna basarsan o sorgu çalışır. Üstteki start'a basmayacaksın
SELECT ContactName Adi, CompanyName SirketAdi, City Sehir FROM Customers

-- filtreleme / WHERE
Select * from Customers where City = 'London' -- where koşul anlamı katar

-- case insensitive : büyük küçük harf duyarsız demektir
SElecT * from Products
Select * from Products where CategoryID = 1 or CategoryID = 3
Select * from Products where CategoryID = 1 and UnitPrice >= 10

-- ORDER BY
Select * from Products order by ProductName -- order by : sırala demektir. Ürün ismine göre sıralayacaktır
Select * from Products order by CategoryID, ProductName -- CategoryId'leri sıralayıp yine o sıraya uygun olarak ProductName'leri de sıralar
Select * from Products order by UnitPrice asc -- artan bir şekilde sıralar. Default olan budur. Vermesek de olur
Select * from Products order by UnitPrice desc -- azalan, düşen bir şekilde sıralar


Select * from Products where categoryId = 1 order by UnitPrice desc

Select count(*) from Products -- count tüm satırların sayısını verir. Tüm product tablosunda kaç satır var bakar.
Select count(*) Adet from Products where CategoryID = 2


-- GROUP BY
/* Yönetim bize hangi kategoride kaç farklı ürünümüz var diye sorsun */
SELECT * FROM Products group by CategoryID -- Bu sordu çalışmaz
SELECT categoryID FROM Products group by CategoryID
/* group by'da her bir kategori için arka planda bir tablo oluşturuluyor gibi düşünebiliriz */

SELECT categoryID, count(*) FROM Products group by CategoryID


SELECT categoryID, count(*) FROM Products where UnitPrice>20 group by CategoryID having count(*)<10
/* Bunun anlamı:
Birim fiyatı 20'den fazla olan ürünleri categoryId'ye göre grupla, toplam sayısı 10'dan az olanları getir*/
-- Önce where işlemi yapılır sorgularda. 


-- JOIN'LER
Select * From Products inner join Categories 
on Products.CategoryID = Categories.CategoryID

Select Products.ProductID, Products.ProductName, Products.UnitPrice,
Categories.CategoryName From Products inner join Categories 
on Products.CategoryID = Categories.CategoryID 

Select Products.ProductID, Products.ProductName, Products.UnitPrice,
Categories.CategoryName From Products inner join Categories 
on Products.CategoryID = Categories.CategoryID 
where Products.UnitPrice > 10


/*  inner join sadece 2 tabloda da eşleşenleri getirir. Eşleşmeyn data varsa
onu getirmez. */


-- SQL isimlendirme standartlarında arada boşluk bırakarak kolon ismi veya tablo ismi vermek doğru değil. Order Details yazarken altta çıkanı seçtiğimizde ide onu otomatik olarak [] arasına aldı. Boluk durumunda biz de öyle yapmalıyız
-- inner joinde 2 tablodaki ortak kolonu bulmak zorundayız
Select * From Products p inner join [Order Details] od 
on p.ProductID = od.ProductID

-- Yukarıdaki sorgu sonucunda bize 2155 kayıt geldi. Çünkü Order Details'ta bu kadar  kayıt var
-- max birbiriyle eşleşebileceği bu kadar. left join'de durum farklıdır:


-- left join : Solda olup (Products'ta olmayıp) sağda olmayanları(Order details'te olmayanları) da getir demektir
Select * From Products p left join [Order Details] od 
on p.ProductID = od.ProductID -- Yine 2155 çıktı. Buradan anlıyorz ki tüm ürünlerde satış gerçekleşmiş. Şöyle ki:
/*  Biz bu sayede her bir Products kaydı Order Details'te var mı karşılaştırdık
 kayıt sayısı ayn çıktığından her bir üründen muuhakkak sipariş verilmiş olduğunu tespit ettik */

 Select * From Customers c INNER join Orders o
 on c.CustomerId = o.CustomerID
 -- 830 kayıt geldi
 
 Select * From Customers c LEFT join Orders o
 on c.CustomerId = o.CustomerID
 -- 832 kayıt geldi

 /* Yani bu demektir ki sistemde kayıtlı ama hiç alışveriş yapmamış 2 adet müşterimiz var */
 -- Solda olup sağda olmadığına göre Orders tablosundaki CustomerID bu 2 kayıt için null durumundadır
 -- Şimdi de onları bulalım

 Select * From Customers c LEFT join Orders o
 on c.CustomerId = o.CustomerID
 where o.CustomerID is null
 -- Burada gelen 2 müşterinin Orders tablosunda hiç kaydı yoktur. Demektir ki hiç siparişleri olmamış bizden
 -- o.CustomerID is null yapmamız doğru olandır. Biz bunun yerine zaten null
 -- gelecek diyip örneğin OrderDate kolonu için is null diyip aratsaydık
 -- arada aslında sipariş verip de OrderDate'i null girilmi olan müşterileri de seçebilirdik
 -- O yüzden bu gibi bir sorguda id için (Yani primary key için) null mı değil mi değerlendirmesi yapmalıyız
 -- Çünkü primary key null olamaz


 -- Aşağıdaki gibi bir sorgu doğru olmaz çünkü sipariş veren ama müşteri tablosunda olmayan bir kayıt gelemez zaten
 Select * From Customers c RIGHT join Orders o
 on c.CustomerId = o.CustomerID
 where o.CustomerID is null

 -- Bu doğrudur
 Select * From Orders o RIGHT join Customers c
 on c.CustomerId = o.CustomerID
 where o.CustomerID is null




 -- Birden fazla tabloyu joinn etmek istersek
Select * From Products p inner join [Order Details] od 
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID





