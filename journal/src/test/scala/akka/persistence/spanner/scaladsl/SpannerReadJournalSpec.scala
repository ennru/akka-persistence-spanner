package akka.persistence.spanner.scaladsl

import akka.persistence.query.PersistenceQuery
import akka.persistence.spanner.SpannerSpec

class SpannerReadJournalSpec extends SpannerSpec {
  "SpannerReadJournal" should {
    "load" in {
      PersistenceQuery(system).readJournalFor[SpannerReadJournal](SpannerReadJournal.Identifier)
    }
  }
}