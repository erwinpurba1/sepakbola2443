import com.larapin.kotlinsub2.BuildConfig


object TheSportDBApi {
    fun getEvent(liga: String?, event: String?): String{
        return BuildConfig.BASE_URL + "api/Liga.json/${BuildConfig.TSDB_API_KEY}" + "/"+event+".php?id="+league
    }

    fun getEventDetail(detail: String?): String{
        return BuildConfig.BASE_URL + "api/Detail.json/${BuildConfig.TSDB_API_KEY}" + "/lookupevent.php?id="+eventId
    }

    fun getEventDetail(event: String?): String{
        return BuildConfig.BASE_URL + "api/event.json/${BuildConfig.TSDB_API_KEY}" + "/lookupevent.php?id="+eventId
    }

    fun getEvent(bundesliga: String?, event: String?): String{
        return BuildConfig.BASE_URL + "api/Bundesliga.json/${BuildConfig.TSDB_API_KEY}" + "/"+event+".php?id="+league
    }
}